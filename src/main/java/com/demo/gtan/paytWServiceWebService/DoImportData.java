package com.demo.gtan.paytWServiceWebService;

import com.demo.param.Heads;
import com.demo.param.Methods;
import com.demo.commons.WebAPISecretary;

import java.io.IOException;

/*
 * @author : eton.lin
 * @description TODO
 * @date 2024-08-16 下午 03:36
 **/
public class DoImportData extends WebAPISecretary {

    DoImportData() {
        super();
        super.setWsdlURL("http://localhost:8081/gtan/services/PaytWServiceWebService?wsdl");
    }

    public static void main(String[] args) {

        DoImportData obj = new DoImportData();
        try {
            String vacharXML = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPFZvdWNoZXJzPgoJPFZvdWNoZXI+CgkJPGFjY291bnRpbmdZZWFyPjExMzwvYWNjb3VudGluZ1llYXI+CgkJPGluc3VyYW5jZUtpbmQ+MTwvaW5zdXJhbmNlS2luZD4KCQk8dm9jaFR5cGU+Mjwvdm9jaFR5cGU+CgkJPHZvY2hURGF0ZT4xMTMwOTExPC92b2NoVERhdGU+CgkJPHZvY2hUTm8+MjA5MDAxMTA8L3ZvY2hUTm8+CgkJPHZvY2hUTmFtZT7ns7vntbHnrqHnkIbogIU8L3ZvY2hUTmFtZT4KCQk8b3JnQ29kZT4wMTwvb3JnQ29kZT4KCQk8dHJhbnNCTm8+MjExMzA5MTEwMDE8L3RyYW5zQk5vPgoJCTx0cmFuc0RhdGU+MTEzMDkxMTwvdHJhbnNEYXRlPgoJCTxWb3VjaGVyRHRscz4KCQkJPFZvdWNoZXJEdGw+CgkJCQk8ZGJjcj4xPC9kYmNyPgoJCQkJPG9yZ0NvZGU+MDEwMDM8L29yZ0NvZGU+CgkJCQk8aW5zdXJhbmNlS2luZD4xPC9pbnN1cmFuY2VLaW5kPgoJCQkJPGlzQWRkSW5zdXJhbmNlLz4KCQkJCTx3cml0ZU9mZk51bT4xMTNBMjAwMDAwNDg8L3dyaXRlT2ZmTnVtPgoJCQkJPHNpZ25Obz4xMTMwMDAwOTM8L3NpZ25Obz4KCQkJCTxzaWduT2ZmTm8+MDAxPC9zaWduT2ZmTm8+CgkJCQk8Y2FzaEFjY3Ruby8+CgkJCQk8Y2FzaEFjY3RuYW1lLz4KCQkJCTxjYXNoQWNjdDEvPgoJCQkJPGFjY0NvZGU+NTEzMDk4PC9hY2NDb2RlPgoJCQkJPHBsYW5GdWxsQ29kZT4wMjA0MDQwMDwvcGxhbkZ1bGxDb2RlPgoJCQkJPHVzZUNvZGU+MTQwODwvdXNlQ29kZT4KCQkJCTx2b2NoQW10PjMyMS4wMDwvdm9jaEFtdD4KCQkJCTx2b2NoQW10MT4wLjAwPC92b2NoQW10MT4KCQkJCTx2b2NoQW10Mj4zMjEuMDA8L3ZvY2hBbXQyPgoJCQkJPHZvY2hNZW1vPuijnOWKqTExM+W5tOW6puW3peS9nOioiOeVq+esrOS4gOacn+asvjwvdm9jaE1lbW8+CgkJCQk8UGF5ZWVzPgoJCQkJCTxQYXllZT4KCQkJCQkJPHZvY2hwTmFtZT7miJHoh6rlt7E8L3ZvY2hwTmFtZT4KCQkJCQkJPHZvY2hwQ29kZS8+CgkJCQkJCTx2b2NocEFtdD4zMjE8L3ZvY2hwQW10PgoJCQkJCQk8dm9jaHBaaXBjZC8+CgkJCQkJCTx2b2NocEFkZHIvPgoJCQkJCQk8dm9jaHBFbWFpbC8+CgkJCQkJCTx2b2NocFVzZURlc2M+5pKl6YKE6Zu255So6YeRPC92b2NocFVzZURlc2M+CgkJCQkJCTx2b2NocFB0eXA+Mzwvdm9jaHBQdHlwPgoJCQkJCQk8dm9jaHBTY29kPjM8L3ZvY2hwU2NvZD4KCQkJCQkJPHZvY2hwU2NvZE5vdGUvPgoJCQkJCQk8dm9jaHBSdHlwLz4KCQkJCQkJPHZvY2hwUnR5cE5vdGUvPgoJCQkJCQk8dm9jaHBBY2N0Lz4KCQkJCQkJPHZvY2hwQWNudC8+CgkJCQkJCTx2b2NocEJhbmtObzEvPgoJCQkJCQk8dm9jaHBCYW5rTmFtZTEvPgoJCQkJCQk8dm9jaHBCYW5rTm8yLz4KCQkJCQkJPHZvY2hwQmFua05hbWUyLz4KCQkJCQkJPHZvY2hwSW5vLz4KCQkJCQkJPHZvY2hwSW5vZGF0ZS8+CgkJCQkJCTx2b2NocEZlZS8+CgkJCQkJCTxwYXllZUZlZUFtdD4wPC9wYXllZUZlZUFtdD4KCQkJCQkJPGFjY0FwQ29kZS8+CgkJCQkJCTxhcE5vLz4KCQkJCQkJPGFwQ29kZS8+CgkJCQkJCTxjZGV0YWlsX2tleWZpZWxkLz4KCQkJCQkJPHJlQXBOby8+CgkJCQkJCTxwdHlwU2VxPjAzPC9wdHlwU2VxPgoJCQkJCTwvUGF5ZWU+CgkJCQk8L1BheWVlcz4KCQkJPC9Wb3VjaGVyRHRsPgoJCQk8Vm91Y2hlckR0bD4KCQkJCTxkYmNyPjI8L2RiY3I+CgkJCQk8b3JnQ29kZT4wMTwvb3JnQ29kZT4KCQkJCTxpbnN1cmFuY2VLaW5kPjE8L2luc3VyYW5jZUtpbmQ+CgkJCQk8aXNBZGRJbnN1cmFuY2UvPgoJCQkJPHdyaXRlT2ZmTnVtLz4KCQkJCTxzaWduTm8vPgoJCQkJPHNpZ25PZmZOby8+CgkJCQk8Y2FzaEFjY3Rubz40MDU8L2Nhc2hBY2N0bm8+CgkJCQk8Y2FzaEFjY3RuYW1lPuWLnuW3peS/nemaquWxgOS9nOalreWfuumHkS3ogbflronnvbI0MDXlsIjmiLY8L2Nhc2hBY2N0bmFtZT4KCQkJCTxjYXNoQWNjdDE+ODIwMzUwMDAyNTMwPC9jYXNoQWNjdDE+CgkJCQk8YWNjQ29kZT4xMTAxMDI8L2FjY0NvZGU+CgkJCQk8cGxhbkZ1bGxDb2RlLz4KCQkJCTx1c2VDb2RlLz4KCQkJCTx2b2NoQW10PjMyMS4wMDwvdm9jaEFtdD4KCQkJCTx2b2NoQW10MT4wLjAwPC92b2NoQW10MT4KCQkJCTx2b2NoQW10Mj4zMjEuMDA8L3ZvY2hBbXQyPgoJCQkJPHZvY2hNZW1vLz4KCQkJCTxQYXllZXMvPgoJCQk8L1ZvdWNoZXJEdGw+CgkJPC9Wb3VjaGVyRHRscz4KCTwvVm91Y2hlcj4KPC9Wb3VjaGVycz4=";
            String signHistory = "PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4NCjznsL3moLjpl5zljaHmuIXllq4+DQogICAgIDznsL3moLjpl5zljaEgaWQ9InN0ZXAwMDAwIj4NCiAgICAgICAgPOewveaguOWFp+WuuSBpZD0iY29udGVudDAwMDAiPg0KICAgICAgICAgICAgPOewveaguOizh+ioij4NCiAgICAgICAgICAgICAgICA85Lq65ZOh6LOH5paZIOmhnuWeiz0i57C95qC45Lq65ZOhIj4NCiAgICAgICAgICAgICAgICAgICAgPOW4s+iZnz51czAyMTI8L+W4s+iZnz4NCiAgICAgICAgICAgICAgICAgICAgPOWnk+WQjT7lkLPil4vlhIA8L+Wnk+WQjT4NCiAgICAgICAgICAgICAgICAgICAgPOiBt+eosT7ntITogZjkurrlk6E8L+iBt+eosT4NCiAgICAgICAgICAgICAgICAgICAgPOWWruS9jT4NCiAgICAgICAgICAgICAgICAgICAgICAgIDzllq7kvY3nt6jomZ8+Mzc5NzMwMDAwQTAzMDA8L+WWruS9jee3qOiZnz4NCiAgICAgICAgICAgICAgICAgICAgICAgIDzllq7kvY3lkI3nqLE+5bGA5pys6YOoPC/llq7kvY3lkI3nqLE+DQogICAgICAgICAgICAgICAgICAgIDwv5Zau5L2NPg0KICAgICAgICAgICAgICAgIDwv5Lq65ZOh6LOH5paZPg0KICAgICAgICAgICAgICAgIDznsL3moLjmmYLplpM+MTEyMTEzMDE3MDgwNjwv57C95qC45pmC6ZaTPg0KICAgICAgICAgICAgPC/nsL3moLjos4foqIo+DQogICAgICAgIDwv57C95qC45YWn5a65Pg0KICAgIDwv57C95qC46Zec5Y2hPg0KICAgIDznsL3moLjpl5zljaEgaWQ9InN0ZXAwMDAxIj4NCiAgICAgICAgPOewveaguOWFp+WuuSBpZD0iY29udGVudDAwMDEiPg0KICAgICAgICAgICAgPOewveaguOizh+ioij4NCiAgICAgICAgICAgICAgICA85Lq65ZOh6LOH5paZIOmhnuWeiz0i57C95qC45Lq65ZOhIj4NCiAgICAgICAgICAgICAgICAgICAgPOW4s+iZnz5pYy1ncmVlbkBtYWlsLnRhaXBlaS5nb3YudHc8L+W4s+iZnz4NCiAgICAgICAgICAgICAgICAgICAgPOWnk+WQjT7otpnil4vlkI08L+Wnk+WQjT4NCiAgICAgICAgICAgICAgICAgICAgPOiBt+eosT7lsIjlk6E8L+iBt+eosT4NCiAgICAgICAgICAgICAgICAgICAgPOWWruS9jT4NCiAgICAgICAgICAgICAgICAgICAgICAgIDzllq7kvY3nt6jomZ8+Mzc5NzMwMDAwQTAzMDA8L+WWruS9jee3qOiZnz4NCiAgICAgICAgICAgICAgICAgICAgICAgIDzllq7kvY3lkI3nqLE+5bGA5pys6YOoPC/llq7kvY3lkI3nqLE+DQogICAgICAgICAgICAgICAgICAgIDwv5Zau5L2NPg0KICAgICAgICAgICAgICAgIDwv5Lq65ZOh6LOH5paZPg0KICAgICAgICAgICAgICAgIDznsL3moLjmmYLplpM+MTEyMTEzMDE3MDgyNzwv57C95qC45pmC6ZaTPg0KICAgICAgICAgICAgICAgIDznsL3moLjmhI/opos+PC/nsL3moLjmhI/opos+DQogICAgICAgICAgICA8L+ewveaguOizh+ioij4NCiAgICAgICAgPC/nsL3moLjlhaflrrk+DQogICAgPC/nsL3moLjpl5zljaE+DQogICAgPOewveaguOmXnOWNoSBpZD0ic3RlcDAwMDIiPg0KICAgICAgICA857C95qC45YWn5a65IGlkPSJjb250ZW50MDAwMiI+DQogICAgICAgICAgICA857C95qC46LOH6KiKPg0KICAgICAgICAgICAgICAgIDzkurrlk6Hos4fmlpkg6aGe5Z6LPSLnsL3moLjkurrlk6EiPg0KICAgICAgICAgICAgICAgICAgICA85biz6JmfPmljLWFhOTExNkBtYWlsLnRhaXBlaS5nb3YudHc8L+W4s+iZnz4NCiAgICAgICAgICAgICAgICAgICAgPOWnk+WQjT7pq5jil4vnhYw8L+Wnk+WQjT4NCiAgICAgICAgICAgICAgICAgICAgPOiBt+eosT7lia/lsYDplbc8L+iBt+eosT4NCiAgICAgICAgICAgICAgICAgICAgPOWWruS9jT4NCiAgICAgICAgICAgICAgICAgICAgICAgIDzllq7kvY3nt6jomZ8+Mzc5NzMwMDAwQTAzMDA8L+WWruS9jee3qOiZnz4NCiAgICAgICAgICAgICAgICAgICAgICAgIDzllq7kvY3lkI3nqLE+5bGA5pys6YOoPC/llq7kvY3lkI3nqLE+DQogICAgICAgICAgICAgICAgICAgIDwv5Zau5L2NPg0KICAgICAgICAgICAgICAgIDwv5Lq65ZOh6LOH5paZPg0KICAgICAgICAgICAgICAgIDznsL3moLjmmYLplpM+MTEyMTEzMDE3MDg0MTwv57C95qC45pmC6ZaTPg0KICAgICAgICAgICAgICAgIDznsL3moLjmhI/opos+PC/nsL3moLjmhI/opos+DQogICAgICAgICAgICA8L+ewveaguOizh+ioij4NCiAgICAgICAgPC/nsL3moLjlhaflrrk+DQogICAgPC/nsL3moLjpl5zljaE+DQogICAgPOewveaguOmXnOWNoSBpZD0ic3RlcDAwMDMiPg0KICAgICAgICA857C95qC45YWn5a65IGlkPSJjb250ZW50MDAwMyI+DQogICAgICAgICAgICA857C95qC46LOH6KiKPg0KICAgICAgICAgICAgICAgIDzkurrlk6Hos4fmlpkg6aGe5Z6LPSLnsL3moLjkurrlk6EiPg0KICAgICAgICAgICAgICAgICAgICA85biz6JmfPmljLXNpbW9ubHVAbWFpbC50YWlwZWkuZ292LnR3PC/luLPomZ8+DQogICAgICAgICAgICAgICAgICAgIDzlp5PlkI0+5ZGC4peL56eRPC/lp5PlkI0+DQogICAgICAgICAgICAgICAgICAgIDzogbfnqLE+5bGA6ZW3PC/ogbfnqLE+DQogICAgICAgICAgICAgICAgICAgIDzllq7kvY0+DQogICAgICAgICAgICAgICAgICAgICAgICA85Zau5L2N57eo6JmfPjM3OTczMDAwMEEwMzAwPC/llq7kvY3nt6jomZ8+DQogICAgICAgICAgICAgICAgICAgICAgICA85Zau5L2N5ZCN56ixPuWxgOacrOmDqDwv5Zau5L2N5ZCN56ixPg0KICAgICAgICAgICAgICAgICAgICA8L+WWruS9jT4NCiAgICAgICAgICAgICAgICA8L+S6uuWToeizh+aWmT4NCiAgICAgICAgICAgICAgICA857C95qC45pmC6ZaTPjExMjExMzAxNzA4NTI8L+ewveaguOaZgumWkz4NCiAgICAgICAgICAgICAgICA857C95qC45oSP6KaLPjwv57C95qC45oSP6KaLPg0KICAgICAgICAgICAgPC/nsL3moLjos4foqIo+DQogICAgICAgIDwv57C95qC45YWn5a65Pg0KICAgIDwv57C95qC46Zec5Y2hPg0KICAgIDznsL3moLjpl5zljaEgaWQ9InN0ZXAwMDA0Ij4NCiAgICAgICAgPOewveaguOWFp+WuuSBpZD0iY29udGVudDAwMDQiPg0KICAgICAgICAgICAgPOewveaguOizh+ioij4NCiAgICAgICAgICAgICAgICA85Lq65ZOh6LOH5paZIOmhnuWeiz0i57C95qC45Lq65ZOhIj4NCiAgICAgICAgICAgICAgICAgICAgPOW4s+iZnz51czAyMTI8L+W4s+iZnz4NCiAgICAgICAgICAgICAgICAgICAgPOWnk+WQjT7lkLPil4vlhIA8L+Wnk+WQjT4NCiAgICAgICAgICAgICAgICAgICAgPOiBt+eosT7ntITogZjkurrlk6E8L+iBt+eosT4NCiAgICAgICAgICAgICAgICAgICAgPOWWruS9jT4NCiAgICAgICAgICAgICAgICAgICAgICAgIDzllq7kvY3nt6jomZ8+Mzc5NzMwMDAwQTAzMDA8L+WWruS9jee3qOiZnz4NCiAgICAgICAgICAgICAgICAgICAgICAgIDzllq7kvY3lkI3nqLE+5bGA5pys6YOoPC/llq7kvY3lkI3nqLE+DQogICAgICAgICAgICAgICAgICAgIDwv5Zau5L2NPg0KICAgICAgICAgICAgICAgIDwv5Lq65ZOh6LOH5paZPg0KICAgICAgICAgICAgICAgIDznsL3moLjmmYLplpM+MTEyMTEzMDE3MDkwODwv57C95qC45pmC6ZaTPg0KICAgICAgICAgICAgPC/nsL3moLjos4foqIo+DQogICAgICAgIDwv57C95qC45YWn5a65Pg0KDQogICAgPC/nsL3moLjpl5zljaE+DQo8L+ewveaguOmXnOWNoea4heWWrj4=";
            String reqXml = getXML("B1", vacharXML, signHistory, "A", "1130911194955");
            obj.setBody(reqXml);
            obj.spnedRequest(Methods.POST.getMethod(), Heads.XML.getMethod());
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
