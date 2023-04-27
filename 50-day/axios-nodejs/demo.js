const axios = require('axios');

axios.get('https://reqres.in/api/users?page=2')
  .then(function (response) {
    // handle success
    console.log(response.data.data);
  })
  .catch(function (error) {
    // handle error
    console.log(error);
  })
  .finally(function () {
    // always executed
  });

const data={
  "name": "morpheus",
  "job": "leader"
}

axios.post('https://reqres.in/api/users',data)
   .then(res=>console.log(`inserting new data ${res.data}`))
   .catch(err=>console.log(err))

   const updatedata={
    email: 'sujit.lawson@reqres.in',
    first_name: 'sujit',
    last_name: 'jagdale',
    avatar: 'https://reqres.in/img/faces/7-image.jpg'
  }
axios.put('https://reqres.in/api/users/7',updatedata)
   .then(res=>console.log(`updating data ${res.updatedata}`))
   .catch(err=>console.log(err))

axios.delete('https://reqres.in/api/8')
   .then(res=>console.log(`${res.status} deleted.`))
   .catch(err=>console.log(err))