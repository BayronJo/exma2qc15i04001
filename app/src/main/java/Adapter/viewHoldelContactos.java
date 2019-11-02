package Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exma2qc15i04001.R;

public class viewHoldelContactos extends RecyclerView.ViewHolder{

    // Declaracion de variables
    private TextView txtNombre, txtTel1, txtTel2;
    private ImageView imgShare;

    public viewHoldelContactos(@NonNull View itemView) {
        super(itemView);

        // Obtenemos los controles
        this.txtNombre = itemView.findViewById(R.id.captionName);
        this.txtTel1 = itemView.findViewById(R.id.captionTelefono1);
        this.txtTel2 = itemView.findViewById(R.id.captionTelefono2);
        this.imgShare = itemView.findViewById(R.id.imgShare);
    }

    public TextView getTxtNombre() {
        return txtNombre;
    }

    public TextView getTxtTel1() {
        return txtTel1;
    }

    public TextView getTxtTel2() {
        return txtTel2;
    }

    public ImageView getImgShare() {
        return imgShare;
    }
}
