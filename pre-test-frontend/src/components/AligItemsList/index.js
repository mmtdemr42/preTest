import {
  Avatar,
  Divider,
  List,
  ListItem,
  ListItemAvatar,
  ListItemText,
  Typography,
} from "@mui/material";
import React from "react";
import { Link } from "react-router-dom";
import DeleteForeverIcon from "@material-ui/icons/DeleteForever";
import ScoreService from "../../lib/service/score";

export default function AlignItemsList({ datas }) {
  return (
    <List sx={{ width: "100%", bgcolor: "background.paper" }}>
      {datas.map((data, index) => (
        <div>
          <Link
            className="text-decoration-none"
            to={"/create/" + data.id}
            key={index}
          >
            <ListItem key={index} alignItems="flex-start">
              <ListItemAvatar key={"avatar_" + index}>
                <Avatar alt={data.name} src={data.student?.imageUrl} />
              </ListItemAvatar>
              <ListItemText
                primary={data.student?.name + " " + data.student?.surname}
                secondary={
                  <React.Fragment>
                    <Typography
                      sx={{ display: "inline" }}
                      component="span"
                      variant="body2"
                      color="text.primary"
                    >
                      Matemetik Sınav Notu:
                    </Typography>
                    {data.score == null ? "Girilmedi" : data.score}
                  </React.Fragment>
                }
              />
            </ListItem>
            <Divider key={"divide_" + index} variant="inset" component="li" />
          </Link>
          <DeleteForeverIcon
            onClick={() => {
              ScoreService.delete(data.id);
            }}
          />
        </div>
      ))}
    </List>
  );
}
