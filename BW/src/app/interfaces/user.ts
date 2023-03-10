import { Role } from "./role";

export interface User {
  id: number,
  username: string,
  password: string,
  email: string,
  name: string,
  surname: string,
  roles: Role[]
}
