import axios from 'axios';

axios.interceptors.response.use(
  response => response,
  async error => console.log("error:", error)
);

export const getEvent = (event) =>
  axios.get(
  `http://localhost:8080/`
  );