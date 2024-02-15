import React from "react";
import Header from "../components/header";
import Footer from "../components/footer";
import { Container, Grid } from "@mui/material";

export default function Layout({ children, backgroundImage }) {
  const layoutStyle = {
    display: "flex",
    flexDirection: "column",
    minHeight: "100vh",
    backgroundImage: `url(${backgroundImage})`, // props.backgroundImage yerine backgroundImage kullanılıyor
    backgroundSize: "cover",
    backgroundPosition: "center",
  };
  return (
    <Grid container style={layoutStyle}>
      <Header />
      <Grid item xs={12} style={{ padding: "20px" }}>
        <Container fixed>{children}</Container>
      </Grid>
      <Footer />
    </Grid>
  );
}
