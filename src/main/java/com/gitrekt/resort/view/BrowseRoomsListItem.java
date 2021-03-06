package com.gitrekt.resort.view;

import com.gitrekt.resort.controller.BrowseRoomsListItemController;
import com.gitrekt.resort.controller.BrowseRoomsScreenController;
import com.gitrekt.resort.model.RoomSearchResult;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ListCell;

public class BrowseRoomsListItem extends ListCell<RoomSearchResult> {

    private final BrowseRoomsListItemController controller;

    private final FXMLLoader fxmlLoader;

    private final Node view;

    public BrowseRoomsListItem(BrowseRoomsScreenController parentController) {
        super();

        try {
            fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/BrowseRoomsListItem.fxml"));
            view = fxmlLoader.load();
            controller = fxmlLoader.getController();
            controller.setParentController(parentController);
        } catch (IOException ex) {
            throw new IllegalStateException(ex + "FXML file loading failed.");
        }
    }

    @Override
    protected void updateItem(RoomSearchResult roomData, boolean empty) {
        super.updateItem(roomData, empty);

        if(empty) {
            setGraphic(null);
        } else {
            controller.setData(roomData);
            setGraphic(view);
        }
    }

}
