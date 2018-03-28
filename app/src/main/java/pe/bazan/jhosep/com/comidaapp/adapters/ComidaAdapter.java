package pe.bazan.jhosep.com.comidaapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import pe.bazan.jhosep.com.comidaapp.R;
import pe.bazan.jhosep.com.comidaapp.models.Comida;

/**
 * Created by Alumno on 27/03/2018.
 */

public class ComidaAdapter extends RecyclerView.Adapter<ComidaAdapter.ViewHolder> {

        private List<Comida> food;

        public void setComida(List<Comida> food) {this.food = food;}

    public class ViewHolder extends RecyclerView.ViewHolder{
            ImageView pictureImage;
            TextView nameText;
            TextView categoriaText;
            TextView tiempoText;
            TextView precioText;

        public ViewHolder(View itemView) {
            super(itemView);
            pictureImage = itemView.findViewById(R.id.picture_image);
            nameText = itemView.findViewById(R.id.name_text);
            categoriaText = itemView.findViewById(R.id.categoria_text);
            tiempoText = itemView.findViewById(R.id.tiempo_text);
            precioText = itemView.findViewById(R.id.precio_text);
        }
    }


    @Override
    public ComidaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comida, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);

            return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Comida comida = food.get(position);

        int resId = holder.itemView.getContext().getResources().getIdentifier(comida.getImagen(), "drawable", holder.itemView.getContext().getPackageName());
        holder.pictureImage.setImageResource(resId);

        holder.nameText.setText(comida.getName());
        holder.categoriaText.setText(comida.getCategoria());
        holder.precioText.setText(comida.getPrecio());
        holder.tiempoText.setText(comida.getTiempo());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Detalles de comida: " + comida.getName(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return food.size();
    }

}
