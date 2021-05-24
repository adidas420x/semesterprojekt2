package gui;

import database.DataAccessException;

public class TryMe {
	public static void main(String[] args) throws DataAccessException {

		OrderGui JFrameInit = new OrderGui();
		JFrameInit.setVisible(true);
	}
}
