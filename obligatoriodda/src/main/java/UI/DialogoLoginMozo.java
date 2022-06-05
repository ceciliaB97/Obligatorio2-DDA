package UI;

import java.awt.Frame;

public class DialogoLoginMozo extends DialogoLogin {

    public DialogoLoginMozo(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Ingrese sus credenciales de Usuario Mozo");
    }
}
