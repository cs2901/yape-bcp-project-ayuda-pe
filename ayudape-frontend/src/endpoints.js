import axios from 'axios';

axios.interceptors.response.use(
  response => response,
  async error => console.log("error:", error)
);

export const getEvent = (event) => {
  console.log("entra a get event");
  axios.get(
  `https://api.idbi.pe/api/v2/events/${event}`
  )
}
