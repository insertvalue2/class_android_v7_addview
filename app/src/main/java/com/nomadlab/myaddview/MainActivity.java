package com.nomadlab.myaddview;

import static com.nomadlab.myaddview.Fruit.getFruits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;

import java.util.ArrayList;

/*
*  리스트 뷰란
*  유사하게 반복되는 뷰들을 그리기 위한 도구
*
*  1. addView -> 실제 잘 사용되지 않는다 (최적화 할 때 사용)
*             -> Item을 담을 xml을 만들어 둔다.
*             -> 그 xml 에 내용을 채워준다(코드)
*             -> Container view 에 더해준다.
*             -> 반복한다.
*  2. ListView -> 예전에 많이 사용되었다.
*  3. RecycleView -> 최근에 가장 많이 사용이 되고 효율이 가장 높다.
*
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fruit> sampleData = getFruits();

        // 준비물
        // 1. 뷰를 위치시킬 컨테이너 가져오기
        LinearLayout container = findViewById(R.id.fruitContainer);
        // 2. LayoutInflater 를 선언 (xml 파일을 메모리에 올리기 위한 객체)
        LayoutInflater inflater = LayoutInflater.from(this);


        // for 문
//        View itemView = inflater.inflate(R.layout.item_food, container, false);
//        // xml 파일에 연결되어서 자바 코드로 id 값을 사용할 수 있다.
//        ImageView fruitImage1 = itemView.findViewById(R.id.fruitImageView);
//        TextView fruitName = itemView.findViewById(R.id.fruitName);
//        TextView fruitDescription = itemView.findViewById(R.id.fruitDescription);
//        TextView fruitPrice = itemView.findViewById(R.id.fruitPrice);
//
//        // 이미지 셋팅
//        Glide.with(this)
//                .load(sampleData.get(0).imageUrl)
//                .centerCrop()
//                .into(fruitImage1);
//        fruitName.setText(sampleData.get(0).name);
//        fruitDescription.setText(sampleData.get(0).description);
//        fruitPrice.setText(sampleData.get(0).price);
//
//        container.addView(itemView);
        // end for

        getFruits().forEach(fruit -> {
            View itemView = inflater.inflate(R.layout.item_food, container, false);
            // xml 파일에 연결되어서 자바 코드로 id 값을 사용할 수 있다.
            ImageView fruitImage1 = itemView.findViewById(R.id.fruitImageView);
            TextView fruitName = itemView.findViewById(R.id.fruitName);
            TextView fruitDescription = itemView.findViewById(R.id.fruitDescription);
            TextView fruitPrice = itemView.findViewById(R.id.fruitPrice);

            // 이미지 셋팅
            Glide.with(this)
                    .load(fruit.imageUrl)
                    .centerCrop()
                    .into(fruitImage1);
            fruitName.setText(fruit.name);
            fruitDescription.setText(fruit.description);
            fruitPrice.setText(fruit.price);
            container.addView(itemView);
        });
    }
}