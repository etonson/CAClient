package com.demo.gtan.paytWServiceWebService;

import com.demo.param.Heads;
import com.demo.param.Methods;
import com.demo.commons.WebAPISecretary;


/*
 * @author : eton.lin
 * @description TODO
 * @date 2024-08-16 下午 03:36
 **/
public class DoImportData extends WebAPISecretary {

    DoImportData() {
        super();
        super.setWsdlURL("http://192.168.60.67/gtan//services/PaytWServiceWebService?wsdl");
    }

    public static void main(String[] args) {

        DoImportData obj = new DoImportData();
        try {
            String vacharXML = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KCTxWb3VjaGVycz4KCQk8Vm91Y2hlcj4KCQkJPGFjY291bnRpbmdZZWFyPjExMzwvYWNjb3VudGluZ1llYXI+CgkJCTxpbnN1cmFuY2VLaW5kPjE8L2luc3VyYW5jZUtpbmQ+CgkJCTx2b2NoVHlwZT4yPC92b2NoVHlwZT4KCQkJPHZvY2hURGF0ZT4xMTMxMjEzPC92b2NoVERhdGU+CgkJCTx2b2NoVE5vPjIxMjAwMTM1PC92b2NoVE5vPgoJCQk8dm9jaFROYW1lPuezu+e1seeuoeeQhuiAhTwvdm9jaFROYW1lPgoJCQk8b3JnQ29kZT4wMTwvb3JnQ29kZT4KCQkJPHRyYW5zQk5vPjIxMTMxMjEzMDAyPC90cmFuc0JObz4KCQkJPHRyYW5zRGF0ZT4xMTMxMjEzPC90cmFuc0RhdGU+CgkJCTxWb3VjaGVyRHRscz4KCQkJCTxWb3VjaGVyRHRsPgoJCQkJCTxkYmNyPjI8L2RiY3I+CgkJCQkJPG9yZ0NvZGU+MDE8L29yZ0NvZGU+CgkJCQkJPGluc3VyYW5jZUtpbmQ+MTwvaW5zdXJhbmNlS2luZD4KCQkJCQk8aXNBZGRJbnN1cmFuY2UvPgoJCQkJCTx3cml0ZU9mZk51bS8+CgkJCQkJPHNpZ25Oby8+CgkJCQkJPHNpZ25PZmZOby8+CgkJCQkJPGNhc2hBY2N0bm8+NDA1PC9jYXNoQWNjdG5vPgoJCQkJCTxjYXNoQWNjdG5hbWU+5Yue5bel5L+d6Zqq5bGA5L2c5qWt5Z+66YeRLeiBt+Wuiee9sjQwNeWwiOaItjwvY2FzaEFjY3RuYW1lPgoJCQkJCTxjYXNoQWNjdDE+ODIwMzUwMDAyNTMwPC9jYXNoQWNjdDE+CgkJCQkJPGFjY0NvZGU+MTEwMTAyPC9hY2NDb2RlPgoJCQkJCTxwbGFuRnVsbENvZGUvPgoJCQkJCTx1c2VDb2RlLz4KCQkJCQk8dm9jaEFtdD41NzAwLjAwPC92b2NoQW10PgoJCQkJCTx2b2NoQW10MT4wLjAwPC92b2NoQW10MT4KCQkJCQk8dm9jaEFtdDI+NTcwMC4wMDwvdm9jaEFtdDI+CgkJCQkJPHZvY2hNZW1vLz4KCQkJCQk8UGF5ZWVzLz4KCQkJCTwvVm91Y2hlckR0bD4KCQkJCTxWb3VjaGVyRHRsPgoJCQkJCTxkYmNyPjE8L2RiY3I+CgkJCQkJPG9yZ0NvZGU+MDEwMDk8L29yZ0NvZGU+CgkJCQkJPGluc3VyYW5jZUtpbmQ+MTwvaW5zdXJhbmNlS2luZD4KCQkJCQk8aXNBZGRJbnN1cmFuY2UvPgoJCQkJCTx3cml0ZU9mZk51bT4xMTNCNzAwMDAwNzk8L3dyaXRlT2ZmTnVtPgoJCQkJCTxzaWduTm8+MTEzMDAwMTYxPC9zaWduTm8+CgkJCQkJPHNpZ25PZmZObz4wMDE8L3NpZ25PZmZObz4KCQkJCQk8Y2FzaEFjY3Ruby8+CgkJCQkJPGNhc2hBY2N0bmFtZS8+CgkJCQkJPGNhc2hBY2N0MS8+CgkJCQkJPGFjY0NvZGU+NTEzMDk4PC9hY2NDb2RlPgoJCQkJCTxwbGFuRnVsbENvZGU+MDIwNTAyMDA8L3BsYW5GdWxsQ29kZT4KCQkJCQk8dXNlQ29kZT4yMzAxPC91c2VDb2RlPgoJCQkJCTx2b2NoQW10PjU3MDAuMDA8L3ZvY2hBbXQ+CgkJCQkJPHZvY2hBbXQxPjAuMDA8L3ZvY2hBbXQxPgoJCQkJCTx2b2NoQW10Mj41NzAwLjAwPC92b2NoQW10Mj4KCQkJCQk8dm9jaE1lbW8+5Yeh5ZOh5bel5ZyL5YWn5Ye65beu44CB6Kq/6YGj44CB5Y+X6KiT562J5Lqk6YCa6LK744CB5L2P5a6/6LK744CB6Iaz6Zuc6LK75Y+K6Ieo5pmC6LK75bGs5LmL44CCPC92b2NoTWVtbz4KCQkJCQk8UGF5ZWVzPgoJCQkJCQk8UGF5ZWU+CgkJCQkJCQk8dm9jaHBOYW1lPueah+eUq+mbheWptzwvdm9jaHBOYW1lPgoJCQkJCQkJPHZvY2hwQ29kZT5BMTIzNDU2Nzg5PC92b2NocENvZGU+CgkJCQkJCQk8dm9jaHBBbXQ+NTcwMDwvdm9jaHBBbXQ+CgkJCQkJCQk8dm9jaHBaaXBjZC8+CgkJCQkJCQk8dm9jaHBBZGRyLz4KCQkJCQkJCTx2b2NocEVtYWlsLz4KCQkJCQkJCTx2b2NocFVzZURlc2MvPgoJCQkJCQkJPHZvY2hwUHR5cD4xPC92b2NocFB0eXA+CgkJCQkJCQk8dm9jaHBTY29kPjQ8L3ZvY2hwU2NvZD4KCQkJCQkJCTx2b2NocFNjb2ROb3RlLz4KCQkJCQkJCTx2b2NocFJ0eXA+Mjwvdm9jaHBSdHlwPgoJCQkJCQkJPHZvY2hwUnR5cE5vdGUvPgoJCQkJCQkJPHZvY2hwQWNjdD4wNTQwMTM1MjIyMjwvdm9jaHBBY2N0PgoJCQkJCQkJPHZvY2hwQWNudD7nmofnlKvpm4Xlqbc8L3ZvY2hwQWNudD4KCQkJCQkJCTx2b2NocEJhbmtObzE+ODIyMDgyMDwvdm9jaHBCYW5rTm8xPgoJCQkJCQkJPHZvY2hwQmFua05hbWUxPuS4reWci+S/oeiol+WVhualremKgOihjOWMl+aWsOiOiuWIhuihjDwvdm9jaHBCYW5rTmFtZTE+CgkJCQkJCQk8dm9jaHBCYW5rTm8yPjgyMjA4MjA8L3ZvY2hwQmFua05vMj4KCQkJCQkJCTx2b2NocEJhbmtOYW1lMj7kuK3lnIvkv6HoqJfllYbmpa3pioDooYzljJfmlrDojorliIbooYw8L3ZvY2hwQmFua05hbWUyPgoJCQkJCQkJPHZvY2hwSW5vPkxCMTIzNDU2Nzg8L3ZvY2hwSW5vPgoJCQkJCQkJPHZvY2hwSW5vZGF0ZT4xMTMxMjEzPC92b2NocElub2RhdGU+CgkJCQkJCQk8dm9jaHBGZWU+Tjwvdm9jaHBGZWU+CgkJCQkJCQk8cGF5ZWVGZWVBbXQ+MDwvcGF5ZWVGZWVBbXQ+CgkJCQkJCQk8YWNjQXBDb2RlLz4KCQkJCQkJCTxhcE5vLz4KCQkJCQkJCTxhcENvZGUvPgoJCQkJCQkJPGNkZXRhaWxfa2V5ZmllbGQvPgoJCQkJCQkJPHJlQXBOby8+CgkJCQkJCQk8cHR5cFNlcT4wMTwvcHR5cFNlcT4KCQkJCQkJPC9QYXllZT4KCQkJCQk8L1BheWVlcz4KCQkJCTwvVm91Y2hlckR0bD4KCQkJPC9Wb3VjaGVyRHRscz4KCQk8L1ZvdWNoZXI+Cgk8L1ZvdWNoZXJzPg==";
            String signHistory = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPOewveaguOmXnOWNoea4heWWrj4857C95qC46Zec5Y2hIGlkPSJzdGVwMDAwMSI+POewveaguOWFp+WuuSBpZD0iY29udGVudDAwMDEiPjznsL3moLjos4foqIo+POS6uuWToeizh+aWmT485biz6JmfPjA0MDAzNjAzPC/luLPomZ8+POWnk+WQjT7miJDoqanlqbc8L+Wnk+WQjT486IG356ixPuWnlOWkluS6uuWToTwv6IG356ixPjzllq7kvY0+POWWruS9jee3qOiZnz4wNDAwMzY8L+WWruS9jee3qOiZnz485Zau5L2N5ZCN56ixPuS4u+ioiOWupDwv5Zau5L2N5ZCN56ixPjwv5Zau5L2NPjwv5Lq65ZOh6LOH5paZPjznsL3moLjmmYLplpM+MTEzMTIyNjE3NTgzNDwv57C95qC45pmC6ZaTPjwv57C95qC46LOH6KiKPjznsL3moLjpl5zljaE+5pyD6KiI5Zau5L2NPC/nsL3moLjpl5zljaE+PC/nsL3moLjlhaflrrk+PC/nsL3moLjpl5zljaE+POewveaguOmXnOWNoSBpZD0ic3RlcDAwMDIiPjznsL3moLjlhaflrrkgaWQ9ImNvbnRlbnQwMDAyIj4857C95qC46LOH6KiKPjzkurrlk6Hos4fmlpk+POW4s+iZnz5qb2huaWUuY29yd2luPC/luLPomZ8+POWnk+WQjT7lraPlv5fpgaA8L+Wnk+WQjT486IG356ixPuS4u+S7uzwv6IG356ixPjzllq7kvY0+POWWruS9jee3qOiZnz4wNDAwMzY8L+WWruS9jee3qOiZnz485Zau5L2N5ZCN56ixPuS4u+ioiOWupDwv5Zau5L2N5ZCN56ixPjwv5Zau5L2NPjwv5Lq65ZOh6LOH5paZPjznsL3moLjmmYLplpM+MTEzMTIyNjE3NTk0Mjwv57C95qC45pmC6ZaTPjwv57C95qC46LOH6KiKPjznsL3moLjpl5zljaE+5pyD6KiI5Zau5L2NPC/nsL3moLjpl5zljaE+PC/nsL3moLjlhaflrrk+PC/nsL3moLjpl5zljaE+POewveaguOmXnOWNoSBpZD0ic3RlcDAwMDMiPjznsL3moLjlhaflrrkgaWQ9ImNvbnRlbnQwMDAzIj4857C95qC46LOH6KiKPjzkurrlk6Hos4fmlpk+POW4s+iZnz5icmVudC5tY2dseW5uPC/luLPomZ8+POWnk+WQjT7osp3kvbPnjrI8L+Wnk+WQjT486IG356ixPue9sumVtzwv6IG356ixPjzllq7kvY0+POWWruS9jee3qOiZnz4wNDAwMDE8L+WWruS9jee3qOiZnz485Zau5L2N5ZCN56ixPue9suacrOmDqDwv5Zau5L2N5ZCN56ixPjwv5Zau5L2NPjwv5Lq65ZOh6LOH5paZPjznsL3moLjmmYLplpM+MTEzMTIyNjE4MDAwNDwv57C95qC45pmC6ZaTPjwv57C95qC46LOH6KiKPjznsL3moLjpl5zljaE+5qmf6Zec6aaW6ZW35oiW5YW25o6I5qyK5Lq6PC/nsL3moLjpl5zljaE+PC/nsL3moLjlhaflrrk+PC/nsL3moLjpl5zljaE+POewveaguOmXnOWNoSBpZD0ic3RlcDAwMDQiPjznsL3moLjlhaflrrkgaWQ9ImNvbnRlbnQwMDA0Ij4857C95qC46LOH6KiKPjzkurrlk6Hos4fmlpk+POW4s+iZnz4wNDAwMzYwNDwv5biz6JmfPjzlp5PlkI0+5r+u6Z2c5oChPC/lp5PlkI0+POiBt+eosT7np5Hlk6E8L+iBt+eosT485Zau5L2NPjzllq7kvY3nt6jomZ8+MDQwMDM2PC/llq7kvY3nt6jomZ8+POWWruS9jeWQjeeosT7kuLvoqIjlrqQ8L+WWruS9jeWQjeeosT48L+WWruS9jT48L+S6uuWToeizh+aWmT48L+ewveaguOizh+ioij4857C95qC46Zec5Y2hPuWHuue0jeWWruS9jTwv57C95qC46Zec5Y2hPjwv57C95qC45YWn5a65Pjwv57C95qC46Zec5Y2hPjwv57C95qC46Zec5Y2h5riF5ZauPg==";
            String reqXml = getXML("B1", vacharXML, signHistory, "A", "1130911194955");
            obj.setBody(reqXml);
            String str = obj.spnedRequest(Methods.POST.getMethod(), Heads.XML.getMethod());
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getXML(String vocherType, String vacharXML, String signHistory, String sys, String releaseDate) {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://service.wbs.ginmao.com\">\n" +
                "    <soapenv:Header>\n" +
                "        <Auth>\n" +
                "            <account>gtan</account>\n" +
                "            <mima>SX1qaz#EDC4</mima>\n" +
                "        </Auth>\n" +
                "    </soapenv:Header>" +

                "   <soapenv:Body>\n" +
                "      <ser:doImportVocharData>\n" +
                "         <!--Optional:-->\n" +
                "         <vocherType>" +
                vocherType +
                "</vocherType>\n" +
                "         <!--Optional:-->\n" +
                "         <vacharXML>" +
                vacharXML +
                "</vacharXML>\n" +

                "         <signHistory>" +
                signHistory +
                "</signHistory>\n" +
                "         <!--Optional:-->\n" +
                "         <sys>" +
                sys +
                "</sys>\n" +
                "         <!--Optional:-->\n" +
                "         <releaseDate>" +
                releaseDate +
                "</releaseDate>\n" +
                "      </ser:doImportVocharData>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
    }
}
