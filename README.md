# SpringBoot-Graphql



#Save User
mutation {
  saveUser(user: {id: 1, firstName: "amol",middleName: "Suresh", lastName: "kachale", age: 10 }) {
    id
  }
}

#Get Users
{
  users {
    id
    firstName
    middleName
    lastName
    age
  }
}

#Get User by id
{
  user(id: 1) {
    id
    firstName
    middleName
    lastName
    age
  }
}


#Delete User by id
mutation {
  deleteUser(id: 1)
}
