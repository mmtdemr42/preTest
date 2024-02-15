import axios from "axios";
import { API_URL } from "../../contants/url";

const postBaseService = async (url, data, token) => {
  const endpoint = API_URL + url;

  const options = {
    method: "POST",
    credentials: "include",
    mode: "cors",
    redirect: "follow",
    headers: {
      "Content-Type": "application/json",
      //Authorization: `Bearer ${token}`,
    },
    data: data,
  };

  try {
    const response = await axios(endpoint, options);
    return response.data;
  } catch (error) {
    throw new Error(error);
  }
};

export default postBaseService;
