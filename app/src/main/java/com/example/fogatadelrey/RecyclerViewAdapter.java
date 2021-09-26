package com.example.fogatadelrey;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    List<ModeloDatos> modeloDatosList;
    Context context;

    public RecyclerViewAdapter(Context context, List<ModeloDatos> modeloDatosList){
        this.context= context;
        this.modeloDatosList = modeloDatosList;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ModeloDatos modeloDatos = modeloDatosList.get(position);
        holder.imageView.setImageResource(modeloDatos.getImageResourse());
        holder.textViewNombrePlato.setText(modeloDatos.getNombrePlato());
        holder.textViewDescrPlato.setText(modeloDatos.getDescripPlato());
        holder.textViewPrecioPlato.setText(modeloDatos.getPrecioPlato());
        holder.textViewDescuPlato.setText(modeloDatos.getDescuPlato());


    }

    @Override
    public int getItemCount() {

        return modeloDatosList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewNombrePlato, textViewDescrPlato, textViewPrecioPlato, textViewDescuPlato;

        public MyViewHolder( View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewNombrePlato = itemView.findViewById(R.id.nombre_plato);
            textViewDescrPlato = itemView.findViewById(R.id.descri_plato);
            textViewPrecioPlato = itemView.findViewById(R.id.precio_plato);
            textViewDescuPlato = itemView.findViewById(R.id.descu_plato);


        }
    }
}
