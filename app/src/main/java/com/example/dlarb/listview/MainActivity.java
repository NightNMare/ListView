package com.example.dlarb.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.num1:
                Toast.makeText(this, "1번", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.num2:
                Toast.makeText(this, "2번", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.num3:
                Toast.makeText(this, "3번", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = findViewById(R.id.list);
        ArrayList data = new ArrayList<Data>();
        data.add(new Data("박쥐", "조류나 쥐류와 전혀 다른 동물이며, 새처럼 날아다니는 유일한 포유류이다. 몸의 구조와 기능이 모두 날기에 편리하도록 발달되어 있으며, 행동도 나는 것과 밀접한 관련이 있다. 만년설이 쌓인 남극이나 북극을 제외한 세계 전 지역에 분포하고 있으며, 동굴이나 폐광, 나무 속, 인가, 삼림 등 다양한 곳에서 서식한다.", R.drawable.bat));
        data.add(new Data("고양이", "머리가 둥글고 얼굴은 짧고 넓으며, 눈이 둥글고 커서 양안시(양쪽 눈의 망막에 맺힌 대상물을 각각이 아닌 하나로 보게 하고, 입체적으로 보게 하는 눈의 기능)의 능력이 뛰어나다. 귓바퀴는 작은 삼각형 모양으로 끝에 긴 털이 있으며 몸에는 다양한 무늬가 있다. 몸길이는 보통 30~60cm이며 몸무게는 2~3kg부터 7.5~8.5kg에 이르기까지 다양하다. 꼬리는 종류에 따라 길이가 다르며 보통은 22~38cm 정도이다. 발가락은 앞다리에 5개, 뒷다리에 4개가 있으며 발톱을 살 속에 감출 수 있다.", R.drawable.cat));
        data.add(new Data("닭", "달걀과 고기를 얻기 위해 기르는 가축이다. 머리에 붉은 볏이 있고 날개는 퇴화하여 잘 날지 못하며 다리는 튼튼하다. 생후 170~200일이 지나면 번식능력을 갖고, 연간 100~220개의 알을 낳는다. 육용과 난용으로 육종된 수많은 품종이 있으며, 가금으로 가장 많이 사육한다. 현재 사람들이 기르고 있는 닭은 3000~4000년 전에 미얀마, 말레이시아, 인도 등지에서 들닭(野鷄)을 길들여 가축화한 것으로 추측된다. 닭의 선조인 들닭에는 말레이시아, 인도, 인도네시아 및 중국 남부지방에 사는 적색들닭과 인도대륙 중부와 서남부에 사는 회색들닭, 실론군도에 사는 실론들닭, 자바섬에 사는 녹색들닭 등이 있다.", R.drawable.chicken));
        data.add(new Data("게", "전 세계에 4,500여종, 우리나라에 183종이 서식하고 있는 것으로 알려져 있는 게는 다리가 열개여서 절지동물 갑각강 중에서 십각목으로 분류된다. 열개의 다리는 기능적으로 한 쌍의 집게발과 네 쌍의 걷는 다리로 나뉜다. 게는 그 종류만큼이나 서식 환경과 외양적 특성이 다양하다. 게들은 바닥을 기어 다니면서 바닥으로 떨어지는 해양생물의 사체를 처리하는 식생을 가지고 있어 바다의 청소부라고도 불린다. 물론 게가 바다생물의 사체만을 먹고 사는 것은 아니다. 게들은 자기보다 작은 게나, 오징어, 문어, 갯지렁이 등을 사냥하기도 한다.", R.drawable.crab));
        data.add(new Data("사슴", "몸길이 30∼310㎝, 어깨높이 20∼235㎝로, 소형종에서 대형종에 이르기까지 크기가 다양하다. 암컷은 수컷보다 몸집이 약간 작고, 뿔이 없다. 뿔은 중실(中實)로서 골질의 가지뿔과 가지의 수는 나이나 장소에 따라 다르다. 즉, 충분히 성장한 개체에서는 보통 가지의 끝이 4개 있는 3차(叉) 4첨(尖)으로 가지를 친다.", R.drawable.deer));
        data.add(new Data("개", "한자로 견(犬)·구(狗) 등으로 표기한다. 포유류 중 가장 오래된 가축으로 거의 전세계에서 사육되며 약 400여 품종이 있다. 개는 이리·자칼(jackal) 등이 조상이라고 하는데, 이는 개와 교배하여 계대(繼代) 번식의 가능성이 있는 새끼를 낳을 수 있다는 것을 뜻한다. 즉 개에 이들의 혈액이 혼혈될 가능성이 있다는 것이다. 그러나 두개골이나 치아의 구조를 보면 개는 혼합된 것이 아니며, 또 그들 중의 어느 것에서 생긴 것이라고도 여겨지지 않는다. 아마도 개는 오스트레일리아에 야생하는 딩고(dingo)나 남아시아에 반야생상태로 서식하는 개와 흡사한, 절멸된 야생종에서 생긴 것으로 추측된다.", R.drawable.dog));
        data.add(new Data("돌고래", "한자로 견(犬)·구(狗) 등으로 표기한다. 포유류 중 가장 오래된 가축으로 거의 전세계에서 사육되며 약 400여 품물돼지라고도 하며, 일반적으로 몸길이 4.5m 이하의 중소형 고래를 돌고래라고 한다. 분류학적으로는 참돌고래과, 강돌고래상과, 쇠돌고래과에 속하는 고래를 말한다. 이빨고래아목에 속하는 고래 전체를 이르는 말로 사용하기도 한다.", R.drawable.dolphin));
        data.add(new Data("코끼리", "코는 근육질로 되어 있으며, 윗입술과 더불어 길게 자라서 사람의 손과 같은 역할을 한다. 머리는 거대하며, 머리 꼭대기를 덮고 있는 뼈는 수많은 공기세포로 이루어져 있다. 두개골은 짧고 높다. 목은 짧으며, 네 다리는 큰 몸을 지탱하기 위하여 굵게 발달되어 있다. 발은 넓고 평평하며 바깥쪽으로 휘어져 있는데, 육질부로 된 발뒤꿈치로 지탱하고 있다. 몸 표면에 굵은 센털이 나 있다. 위턱의 앞니는 길게 자라서 상아라고 하는 1쌍의 송곳니가 된다.", R.drawable.elephant));
        data.add(new Data("물고기", "수중생활을 하는 것 중, 폐로 호흡하는 고래·돌고래, 성체가 되면 발이 나오는 개구리·도롱뇽, 무척추동물인 오징어·조개·해삼·해파리 등은 물고기에 속하지 않는다. 현생하는 종족에서는 원구류·연골어류·경골어류 3족을 물고기라고 한다. 현재 전 세계에서 발견된 물고기는 약 2만 종에 달하고 우리 나라에서는 약 870종이 발견되었다. 그러나 심해개발 등으로 더 많은 수가 발견될 것으로 예상된다.", R.drawable.fish));
        data.add(new Data("기린", "기린은 현재 약 8~9개의 아종으로 나뉘어져 있으며, 이들 사이에는 얼룩무늬의 패턴과 분포 등의 차이가 있다. 학자에 따라 아종의 종류와 수가 다르게 구분되며, 다른 종으로 구분되어야 한다는 주장도 있다. 건조한 사바나, 특히 아카시아가 있는 개방된 산림, 계절적 범람원, 보통 낮거나 중간 높이 나무가 산재하여 자라는 지역에 서식한다. 기린은 보통 단독 또는 작은 무리로 관찰된다. 보통 젊은 수컷은 수컷무리를 이루며 나이가 들면 단독생활을 한다. 건기에는 강 근처로 밀집하고 우기에는 산림지로 퍼진다. 세력권은 형성하지 않는다. 대개 저녁이나 아침에 활동성이 많고 더운 한낮에는 휴식을 취한다. 보통 서서 잠을 자나 간혹 눕기도 하며, 깊은 잠을 잘 때는 뒷다리 아랫부분에 머리를 기대어 잔다.", R.drawable.giraffe));
        data.add(new Data("돼지", "돼지속의 동물로, 고기를 이용할 목적으로 기른다. 영어로는 pig·hog·swine 등으로 쓰이고 수퇘지는 boar, 암퇘지는 sow로 표현한다. 한자어로는 저(猪)·시(豕)·돈(豚)·체·해(亥) 등으로 적고, 한국에서는 돝·도야지로도 불렀다. 돼지가 가축화된 시기는 동남아시아에서는 약 4800년 전, 유럽에서는 약 3500년 전이며, 한국에 개량종 돼지가 들어온 것은 1903년이다.", R.drawable.pig));
        data.add(new Data("토끼", "토끼목 토끼과에 속하는 동물의 총칭으로 중치류(重齒類)라고도 한다. 아프리카·아메리카·아시아·유럽에 분포하며 종류가 많다. 일반적으로 토끼라고 하면 유럽굴토끼의 축용종(畜用種)인 집토끼를 가리킬 때가 많다. 귀가 길고 꼬리는 짧으며, 쥐목(설치류)과 달라서 위턱의 앞니가 2쌍이고, 아래턱을 양옆으로 움직여서 먹이를 먹는다. 종에 따라 크기는 매우 다양하며 작게는 1~1.5kg, 크게는 7~8kg에 달하기도 한다. 토끼류를 일반적으로 나누면 멧토끼류[野兎類]와 굴토끼류[穴兎類]로 크게 나눌 수 있다.", R.drawable.rabbit));
        data.add(new Data("거북이", "지구상에 서식하는 파충류 중 가장 오래 전부터 존재해온 동물 중 하나로 평가되며, 가장 오래된 화석종으로는 중생대 트라이아스기 이후의 지층에서 발견되었다. 이들 화석종은 현존하는 거북류와 별 차이가 없으나 거북의 진화 과정은 아직 밝혀진 것이 없다. 거북의 조상으로 보이는 에우노토사우루스(Eunotosaurus)는 늑골이 편평하고 둥그스름하게 몸을 둘러싸고 있다. 현재 지구상에 생존하는 것은 12과 240여 종이 알려졌으며 한국에서는 바다거북과의 바다거북, 장수거북과의 장수거북, 남생이과의 남생이, 자라과의 자라 등 4종이 알려져 있다.", R.drawable.turtle));
        CustomAdapter adapter = new CustomAdapter(data, this);
        list.setAdapter(adapter);

    }
}