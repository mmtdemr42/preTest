import { Button } from "@mui/material";
import React, { useEffect, useState } from "react";
import Layout from "../layouts/layaout";
import ScoreService from "../lib/service/score";
import { useParams } from "react-router-dom";
import ScoreForm from "../components/ScoreForm";

export default function CreatePage() {
  const { id } = useParams();
  const [scoreDto, setScoreDto] = useState({ score: 0, studentId: 0 });

  useEffect(() => {
    const fetchData = async () => {
      const response = await ScoreService.getScoreById(id);
      setScoreDto(response);
    };
    if (id) {
      fetchData();
    }
  }, []);

  return (
    <Layout>
      <Button onClick={ScoreService.saveScore(scoreDto)}>Kaydet</Button>
      <ScoreForm score={scoreDto} />
    </Layout>
  );
}
