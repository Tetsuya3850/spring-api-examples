import axios from "axios";
import { getToken } from "./tokenUtils";

const SERVER_URL = "https://auth-server-spring-3850.herokuapp.com";
axios.defaults.baseURL = SERVER_URL;

const setAuthHeader = () => ({
  headers: { authorization: `Bearer ${getToken()}` }
});

export const wakeup = () => axios.get("");
export const signup = payload => axios.post(`/persons/signup`, payload);
export const signin = payload => axios.post(`/login`, payload);
export const getUser = userId =>
  axios.get(`/persons/${userId}`, setAuthHeader());
