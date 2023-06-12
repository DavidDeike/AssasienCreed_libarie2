package com.example.assasiencreed_libarie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assasiencreed_libarie.R
import com.example.assasiencreed_libarie.data.model.Game

// der Adapter braucht den Context um auf String Resourcen zuzugreifen
// und die Liste an Jokes um sie für die RecyclerView vorzubereiten
class GameAdapter(

    private val dataset: List<Game>
) : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    // IDEE EINES VIEWHOLDERS
    // der ViewHolder weiß welche Teile des Layouts beim Recycling angepasst werden
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val gameImage = view.findViewById<ImageView>(R.id.game_iv)
        val gameTitle = view.findViewById<TextView>(R.id.game_name_tv)
        val gameDate = view.findViewById<TextView>(R.id.release_date_tv)
    }

    // ERSTELLEN DES VIEWHOLDERS
    // hier werden neue ViewHolder erstellt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.game_item, parent, false)

        return ViewHolder(adapterLayout)
    }

    // BEFÜLLEN DES VIEWHOLDERS
    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val game = dataset[position]

        holder.gameImage.setImageResource(game.imageResource)
        holder.gameTitle.text = game.title
        holder.gameDate.text = game.date.toString()
    }



    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}