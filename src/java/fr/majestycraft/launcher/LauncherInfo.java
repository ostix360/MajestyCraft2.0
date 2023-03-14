package fr.majestycraft.launcher;

import animatefx.animation.*;
import fr.trxyy.alternative.alternative_api.*;
import fr.trxyy.alternative.alternative_api.utils.*;
import fr.trxyy.alternative.alternative_api_ui.base.*;
import fr.trxyy.alternative.alternative_api_ui.components.*;
//import javafx.application.*;
import javafx.event.*;
//import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class LauncherInfo extends IScreen {
	
	private String VersionL = "Version : 3.1.2 (14/03/2023)";

	private LauncherLabel titleLabel;
	private LauncherLabel developpeur;
	private LauncherLabel DEV;
	private LauncherLabel HELPER;
	private LauncherLabel remarque;
	private LauncherLabel REM;
	private LauncherLabel REM2;
	private LauncherLabel version;

	private LauncherLabel CHANGE1;
	private LauncherLabel CHANGE2;
	private LauncherLabel CHANGE3;
	private LauncherLabel CHANGE4;
	// private LauncherLabel CHANGE5;
	// private LauncherLabel CHANGE6;
	private LauncherLabel changelogs;
	//private Slider volume;

	private LauncherRectangle topRectangle;

	private LauncherButton quitterButton;

	public LauncherInfo(final Pane root, final GameEngine engine, final LauncherPanel pane) {
		this.drawBackgroundImage(engine, root, "background.png");
		/** ===================== RECTANGLE NOIR EN HAUT ===================== */
		this.topRectangle = new LauncherRectangle(root, 0, 0, 1500, 15);
		this.topRectangle.setOpacity(0.7);
		this.topRectangle.setVisible(false);
		/** ===================== LABEL TITRE ===================== */
		this.titleLabel = new LauncherLabel(root);
		this.titleLabel.setText("INFORMATIONS");
		this.titleLabel.setStyle("-fx-text-fill: white;");
		this.titleLabel.setFont(FontLoader.loadFont("Comfortaa-Regular.ttf", "Comfortaa", 26F));
		this.titleLabel.setPosition(350, 20);
		this.titleLabel.setSize(230, 35);

		/** ===================== TITRE DEVELOPPEUR ===================== */
		this.developpeur = new LauncherLabel(root);
		this.developpeur.setText("Développeur");
		this.developpeur.setFont(Font.font("FontName", FontWeight.BOLD, 24d));
		this.developpeur.setStyle("-fx-background-color: transparent; -fx-text-fill: orange");
		this.developpeur.setPosition(engine.getWidth() / 2 - 479, engine.getHeight() / 2 - 300);
		this.developpeur.setOpacity(0.7);
		this.developpeur.setSize(500, 40);
		this.developpeur.setVisible(true);

		/** ===================== TITRE DEV ===================== */
		this.DEV = new LauncherLabel(root);
		this.DEV.setText("Développeur : Capdrake, Ostix360");
		this.DEV.setFont(Font.font("FontName", FontWeight.BOLD, 20d));
		this.DEV.setStyle("-fx-text-fill: white;");
		this.DEV.setPosition(engine.getWidth() / 2 - 449, engine.getHeight() / 2 - 250);
		this.DEV.setOpacity(0.7);
		this.DEV.setSize(500, 40);
		this.DEV.setVisible(true);

		/** ===================== TITRE HELPER ===================== */
		this.HELPER = new LauncherLabel(root);
		this.HELPER.setText("Helper : aucun");
		this.HELPER.setFont(Font.font("FontName", FontWeight.BOLD, 20d));
		this.HELPER.setStyle("-fx-text-fill: white;");
		this.HELPER.setPosition(engine.getWidth() / 2 - 449, engine.getHeight() / 2 - 220);
		this.HELPER.setOpacity(0.7);
		this.HELPER.setSize(500, 40);
		this.HELPER.setVisible(true);

		/** ===================== TITRE REMARQUE ===================== */
		this.remarque = new LauncherLabel(root);
		this.remarque.setText("Remarque");
		this.remarque.setFont(Font.font("FontName", FontWeight.BOLD, 24d));
		this.remarque.setStyle("-fx-background-color: transparent; -fx-text-fill: orange");
		this.remarque.setPosition(engine.getWidth() / 2 - 479, engine.getHeight() / 2 - 180);
		this.remarque.setOpacity(0.7);
		this.remarque.setSize(500, 40);
		this.remarque.setVisible(true);

		/** ===================== TITRE remarque 1 ===================== */
		this.REM = new LauncherLabel(root);
		this.REM.setText("1 => Si une version ne démarre pas, allez dans votre %appdata% et ");
		this.REM.setFont(Font.font("FontName", FontWeight.BOLD, 16d));
		this.REM.setStyle("-fx-text-fill: white;");
		this.REM.setPosition(engine.getWidth() / 2 - 449, engine.getHeight() / 2 - 140);
		this.REM.setOpacity(0.7);
		this.REM.setSize(1000, 40);
		this.REM.setVisible(true);

		/** ===================== TITRE SUITE remarque 1 ===================== */
		this.REM2 = new LauncherLabel(root);
		this.REM2.setText("supprimez les fichiers 'Launcher_config.json' et '.majestycraft'");
		this.REM2.setFont(Font.font("FontName", FontWeight.BOLD, 16d));
		this.REM2.setStyle("-fx-text-fill: white;");
		this.REM2.setPosition(engine.getWidth() / 2 - 404, engine.getHeight() / 2 - 120);
		this.REM2.setOpacity(0.7);
		this.REM2.setSize(1000, 40);
		this.REM2.setVisible(true);

		/** ===================== TITRE CHANGELOGS ===================== */
		this.changelogs = new LauncherLabel(root);
		this.changelogs.setText("Changelogs");
		this.changelogs.setFont(Font.font("FontName", FontWeight.BOLD, 24d));
		this.changelogs.setStyle("-fx-background-color: transparent; -fx-text-fill: orange");
		this.changelogs.setPosition(engine.getWidth() / 2 - 479, engine.getHeight() / 2 - 60);
		this.changelogs.setOpacity(0.7);
		this.changelogs.setSize(500, 40);
		this.changelogs.setVisible(true);

		/** ===================== changelogs 1 ===================== */
		this.CHANGE1 = new LauncherLabel(root);
		this.CHANGE1.setText("- Ajout d'Optifine sur la 1.19.3");
		this.CHANGE1.setFont(Font.font("FontName", FontWeight.BOLD, 20d));
		this.CHANGE1.setStyle("-fx-text-fill: white;");
		this.CHANGE1.setPosition(engine.getWidth() / 2 - 449, engine.getHeight() / 2 - 20);
		this.CHANGE1.setOpacity(0.7);
		this.CHANGE1.setSize(1000, 40);
		this.CHANGE1.setVisible(true);

		/** ===================== changelogs 2 ===================== */
		this.CHANGE2 = new LauncherLabel(root);
		this.CHANGE2.setText("- Ajout de la 1.19.4");
		this.CHANGE2.setFont(Font.font("FontName", FontWeight.BOLD, 20d));
		this.CHANGE2.setStyle("-fx-text-fill: white;");
		this.CHANGE2.setPosition(engine.getWidth() / 2 - 449, engine.getHeight() / 2 + 20);
		this.CHANGE2.setOpacity(0.7);
		this.CHANGE2.setSize(1000, 40);
		this.CHANGE2.setVisible(true);

		/** ===================== changelogs 3 ===================== */
		this.CHANGE3 = new LauncherLabel(root);
		this.CHANGE3.setText("- Correction du bug de la t�te du joueur mal affich�e");
		this.CHANGE3.setFont(Font.font("FontName", FontWeight.BOLD, 20d));
		this.CHANGE3.setStyle("-fx-text-fill: white;");
		this.CHANGE3.setPosition(engine.getWidth() / 2 - 449, engine.getHeight() / 2 + 60);
		this.CHANGE3.setOpacity(0.7);
		this.CHANGE3.setSize(1000, 40);
		this.CHANGE3.setVisible(true);

		/** ===================== changelogs 4 ===================== */
		this.CHANGE4 = new LauncherLabel(root);
		this.CHANGE4.setText("- Ajout d'un bouton démarrer lors de la connexion auto");
		this.CHANGE4.setFont(Font.font("FontName", FontWeight.BOLD, 20d));
		this.CHANGE4.setStyle("-fx-text-fill: white;");
		this.CHANGE4.setPosition(engine.getWidth() / 2 - 449, engine.getHeight() / 2 + 100);
		this.CHANGE4.setOpacity(0.7);
		this.CHANGE4.setSize(1000, 40);
		this.CHANGE4.setVisible(false);

		/** ===================== TITRE VERSION ===================== */
		this.remarque = new LauncherLabel(root);
		this.remarque.setText("Version");
		this.remarque.setFont(Font.font("FontName", FontWeight.BOLD, 24d));
		this.remarque.setStyle("-fx-background-color: transparent; -fx-text-fill: orange");
		this.remarque.setPosition(engine.getWidth() / 2 - 479, engine.getHeight() / 2 + 140);
		this.remarque.setOpacity(0.7);
		this.remarque.setSize(500, 40);
		this.remarque.setVisible(true);

		/** ===================== TITRE Version actuelle ===================== */
		this.version = new LauncherLabel(root);
		this.version.setText(VersionL);
		this.version.setFont(Font.font("FontName", FontWeight.BOLD, 20d));
		this.version.setStyle("-fx-text-fill: white;");
		this.version.setPosition(engine.getWidth() / 2 - 449, engine.getHeight() / 2 + 180);
		this.version.setOpacity(0.7);
		this.version.setSize(1000, 40);
		this.version.setVisible(true);

		/** ===================== BOUTON QUITTER ===================== */
		this.quitterButton = new LauncherButton(root);
		this.quitterButton.setText("Retour");
		this.quitterButton.setStyle("-fx-background-color: rgba(53, 89, 119, 0.4); -fx-text-fill: white;");
		this.quitterButton.setFont(FontLoader.loadFont("Comfortaa-Regular.ttf", "Comfortaa", 16F));
		this.quitterButton.setPosition(700, 550);
		this.quitterButton.setSize(130, 35);
		this.quitterButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				final ZoomOutDown animation = new ZoomOutDown(root);
				animation.setOnFinished(new EventHandler<ActionEvent>() {
					@Override
					public void handle(final ActionEvent actionEvent) {
						Stage stage = (Stage) ((LauncherButton) event.getSource()).getScene().getWindow();
						stage.close();
					}
				});
				animation.setResetOnFinished(true);
				animation.play();
			}
		});

//		this.volume = new Slider();  TODO Fonctionne pas
//		this.volume.setStyle("-fx-control-inner-background: rgba(46, 47, 48, 0.5);");
//		this.volume.setMin(0.0);
//		this.volume.setMax(10.0);
//		this.volume.setValue(LauncherMain.getMediaPlayer().getVolume());
//		this.volume.setLayoutX(50);
//		this.volume.setLayoutY(210);
//		this.volume.setPrefWidth(395);
//		this.volume.setBlockIncrement(1);
//
//		Platform.runLater(() -> root.getChildren().add(volume));
//		this.volume.setVisible(false);
	}
}