import React from "react";
import Layout from "../layouts/layaout";
import { Button, Grid } from "@mui/material";

export default function HomePage() {
  return (
    <Layout backgroundImage="/images/education.jpg">
      <Grid
        container
        direction="row"
        justifyContent="center"
        alignItems="center"
      >
        <Button
          className="me-3 text-capitalize"
          variant="contained"
          href="/create"
        >
          Not Ekleme
        </Button>
        <Button
          className="ms-3 text-capitalize"
          variant="contained"
          href="/list"
        >
          Not Listeleme
        </Button>
      </Grid>
    </Layout>
  );
}
