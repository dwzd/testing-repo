package da;

import org.testng.annotations.Test;

public class HouSouPageTest {
    @Test
    public void searchTest(){
//实例化haosou页面对象模型
        test360so hsp =new test360so();
//使用页面封装的打开链接方法
        hsp.openUrl();
//使用页面封装的输入操作
        hsp.searchByKeyword();
//使用页面封装的退出操作
        hsp.close();
    }

    }
