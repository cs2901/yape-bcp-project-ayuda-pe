import axios from 'axios';

axios.interceptors.response.use(
  response => response,
  async error => console.log("error:", error)
);

export const getEvent = (event) =>
  axios.get(
  `https://api.idbi.pe/api/v2/events/${event}`
  )

export const sendMessage = (message) =>
  console.log("axios ",message)
