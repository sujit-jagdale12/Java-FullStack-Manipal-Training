const { MongoClient, ServerApiVersion } = require('mongodb');

const url = 'mongodb://127.0.0.1:27017/mydb';

const client = new MongoClient(url)
client.connect().then(() => {
  console.log(`✅ Connected Successfully`)

  const db = client.db('mydb');

  const collection = db.collection('cars');

  collection.insertOne({ a: 1 })
  .then(result => {
      console.log(`✅ Data Inserted Successfully`)
      console.log(result)
  }).catch(err => {
      console.log(`❌ Problme in inserting data`)
      console.log(err)
  })
}).catch(console.log);