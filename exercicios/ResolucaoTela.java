import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int widthScreen = (int) screenSize.getWidth();
        int heightScreen = (int) screenSize.getHeight();

        System.out.printf("A resolução da tela é: %dx%d\n",  widthScreen, heightScreen);
    }
}
