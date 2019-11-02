package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exma2qc15i04001.R;

import java.util.List;

import Entidades.Contactos;

public class AdaptadorContactos  extends RecyclerView.Adapter<viewHoldelContactos>{
    // Declaracion de variables
    private List<Contactos> listContactos;

    public AdaptadorContactos(List<Contactos> datasources){
        // Inicializamos el datasources
        this.listContactos =datasources;
    }

    @NonNull
    @Override
    public viewHoldelContactos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Creamos la vista usando el Layout de plantilla
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.plantilla_contacto,parent, false);
        viewHoldelContactos vhContactos = new viewHoldelContactos(v);
        return vhContactos;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHoldelContactos holder, int position) {
        // Establecemos la información del datasources al ViewHolder
        holder.getTxtNombre().setText(this.listContactos.get(position).getNombre());
        holder.getTxtTel1().setText(this.listContactos.get(position).getTelefono1());
        holder.getTxtTel2().setText(this.listContactos.get(position).getTelefono2());
        if (this.listContactos.get(position).getFavorito() == 1){
            holder.getImgShare().setSelected(true);
        }else {
            holder.getImgShare().setSelected(false);
        }

    }

    @Override
    public int getItemCount() {
        return this.listContactos.size();
    }

}
