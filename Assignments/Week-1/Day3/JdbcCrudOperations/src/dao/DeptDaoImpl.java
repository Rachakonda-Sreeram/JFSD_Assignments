package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Dept;

public class DeptDaoImpl implements IDeptDao {

	Connection conn = null;

	public DeptDaoImpl() {
		conn = DBUtil.getDBConnection();

	}

	@Override
	public int insert(Dept dept) {
		String query = "INSERT INTO dept (dno, dname, location) VALUES (?, ?, ?)";
		try (PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setInt(1, dept.getDno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLocation());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public int update(Dept dept) {
		String query = "UPDATE dept SET dname=?, location=? WHERE dno=?";
		try (PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLocation());
			pstmt.setInt(3, dept.getDno());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int deleteOne(int dno) {
		String query = "DELETE FROM dept WHERE dno=?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, dno);

            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
	}

	@Override
	public Dept selectOne(int dno) {
		String selectOne = "select dno,dname,location from dept where dno = ?;";
		try (PreparedStatement pstmt = conn.prepareStatement(selectOne)){
			pstmt.setInt(1, dno);
			try (ResultSet resultSet = pstmt.executeQuery()) {
                if (resultSet.next()) {
                    Dept dept = new Dept();
                    dept.setDno(resultSet.getInt("dno"));
                    dept.setDname(resultSet.getString("dname"));
                    dept.setLocation(resultSet.getString("location"));
                    return dept;
                }
            }
				} catch (SQLException e) {
					e.printStackTrace();
				}
		return null;
	}

	@Override
	public List<Dept> selectAll() {
		String selectAll = "select dno,dname,location from dept;";
		List<Dept> deptList = new ArrayList<>();
		try {

			PreparedStatement pstmt = conn.prepareStatement(selectAll);
			//pstmt.setInt(1, 10);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Dept dept = new Dept(rs.getInt("dno"), rs.getString("dname"), rs.getString("location"));
				deptList.add(dept);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return deptList;
	}

}
