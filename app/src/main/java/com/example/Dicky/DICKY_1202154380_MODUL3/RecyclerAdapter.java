package com.example.Dicky.DICKY_1202154380_MODUL3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;


//Mengatur data nantinya akan ditampilkan
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    //digunakan untuk menerima dan menyimpan list item
    private ArrayList<String> arrayListTitle, arrayListDesc;
    private ArrayList<Integer> arrayListGambar;

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerAdapter(ArrayList<String> arrayListTitle, ArrayList<String> arrayListDesc, ArrayList<Integer> arrayListGambar){
        this.arrayListTitle = arrayListTitle;
        this.arrayListDesc = arrayListDesc;
        this.arrayListGambar = arrayListGambar;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Title, Desc;
        private ImageView Gambar;
        private LinearLayout itemList;

        public ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            Title = itemView.findViewById(R.id.title);
            Desc = itemView.findViewById(R.id.desc);
            Gambar = itemView.findViewById(R.id.gambar);
            itemList = itemView.findViewById(R.id.list_item);

        }

    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_product, parent,false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(final RecyclerAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String title = arrayListTitle.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String desc = arrayListDesc.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer gambar = arrayListGambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.Title.setText(title);// Mengambil text sesuai posisi yang telah ditentukan
        holder.Desc.setText(desc); // Mengambil text sesuai posisi yang telah ditentukan
        holder.Gambar.setImageResource(gambar); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat List Ditekan
        holder.itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), detailActivity.class);
                String descs = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce interdum sem eget bibendum consectetur. Mauris maximus urna in sapien pellentesque, in sollicitudin nulla lobortis. Nunc vel posuere velit. Curabitur feugiat nibh eget enim tincidunt, viverra cursus arcu commodo. Nullam gravida dolor eget vehicula consequat. Nunc mollis aliquam neque ac lobortis. Sed laoreet ultrices tortor quis placerat. Nulla porttitor mollis consequat\n" +
                        "        Minum air putih pada perut kosong bisa meningkatkan tingkat metabolisme Anda setidaknya 24 persen. Hal ini sangat penting bagi orang-orang yang sedang melakukan diet ketat.\n" +
                        "\n" +
                        "Vivamus ultricies dapibus nibh, a bibendum leo ullamcorper mattis. Proin quis odio feugiat, molestie justo eu, feugiat justo. Integer aliquam enim dui, eu semper orci mollis non. Integer efficitur est non fringilla feugiat. Sed condimentum rhoncus erat, eget posuere mi facilisis vitae. Duis porttitor leo ac neque malesuada laoreet.\n" +
                        "Donec vestibulum fermentum mollis. Duis gravida, metus ac facilisis tempus, quam nisl interdum leo, sed sodales odio erat at nisi. Quisque sollicitudin ipsum vitae porttitor imperdiet. Vivamus sit amet nibh sem. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus\n" +
                        "Nunc iaculis mauris quis metus luctus, eu aliquet justo efficitur. Nulla a mi ut massa gravida malesuada. Vestibulum pulvinar sit amet ex at imperdiet.\n" +
                        "Suspendisse potenti. Phasellus pulvinar ullamcorper lectus pretium tincidunt. Nunc mollis, dolor in dignissim luctus, eros ipsum hendrerit lacus, ut vehicula massa leo ut ligula. Aenean rutrum placerat libero. Sed ut ipsum id tortor accumsan molestie. Donec placerat non enim eu mollis. In hendrerit finibus nisi, sed malesuada nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n";
                switch (position){
                    case 0:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("title", arrayListTitle.get(position));
                        intent.putExtra("desc", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListTitle.size();
    }
}
