import deleteBaseService from "./baseService/deleteBaseService";
import getBaseService from "./baseService/getBaseService";
import postBaseService from "./baseService/postBaseService";

export default class ScoreService {
  static async saveScore(requestBody) {
    const response = await postBaseService("score/save", requestBody);
    return response;
  }

  static async getScoreList() {
    const response = await getBaseService("score/list");
    return response;
  }

  static async getScoreById(id) {
    const response = await getBaseService("score/" + id);
    return response;
  }

  static async delete(id) {
    const response = await deleteBaseService("score/delete/" + id);
    return response;
  }
}
