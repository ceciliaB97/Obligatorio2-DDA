package UI;

import java.awt.Frame;

public class DialogoLoginGestor extends DialogoLogin {

    public DialogoLoginGestor(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Ingrese sus credenciales de Usuario Gestor");
    }
}
