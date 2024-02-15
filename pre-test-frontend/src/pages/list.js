import React, { useEffect, useState } from "react";
import Layout from "../layouts/layaout";
import AlignItemsList from "../components/AligItemsList";
import ScoreService from "../lib/service/score";

export default function ListPage() {
  const [datas, setDatas] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      const response = await ScoreService.getScoreList();
      setDatas(response);
    };

    fetchData();
  }, []);

  return (
    <Layout>
      <AlignItemsList key={"list"} datas={datas} />
    </Layout>
  );
}
