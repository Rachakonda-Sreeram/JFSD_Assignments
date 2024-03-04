import { Injectable } from '@angular/core';
import { User } from './user';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() {

    console.log('Service object Initialized');
   

  }

  users: User[] = [{

    'eid':101,
    'ename':"Sreeram",
    'esalary':40000


 },
 {

  'eid':102,
  'ename':"Surya",
  'esalary':42000


},
{

'eid':103,
'ename':"Sudheer",
'esalary':50000


}
  ];
  getAllUsers(): User[] {
    console.log("These are all the users:");
    return this.users;
  }
}
