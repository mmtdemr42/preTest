import axios from "axios";
import { API_URL } from "../../contants/url";

const getBaseService = async (url, tooken) => {
  const endpoint = API_URL + url;
  console.log(endpoint);

  const options = {
    method: "GET",
    credentials: "include",
    mode: "cors",
    redirect: "follow",
    headers: {
      "Content-Type": "application/json",
      //Authorization: `Bearer ${token}`,
    },
  };

  try {
    const response = await axios.get(endpoint, options);
    return response.data.data;
  } catch (error) {
    throw new Error(error);
  }
};

export default getBaseService;
