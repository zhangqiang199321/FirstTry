package com.example.xiaoshuo.utils;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SolrUtils {
    // 指定solr服务器的地址
    private final static String SOLR_URL = "http://192.168.178.128:8983/solr/";

    // 创建一个客户端
    public HttpSolrClient createSolrServer() {
        HttpSolrClient solr = null;
        solr = new HttpSolrClient.Builder(SOLR_URL).withConnectionTimeout(10000).withSocketTimeout(60000).build();
        return solr;
    }

    // 添加文档
    public void addDoc() throws SolrServerException, IOException {
        // 构造一篇文档
        SolrInputDocument document = new SolrInputDocument();
        // 往doc中添加字段,在客户端这边添加的字段必须在服务端中有过定义
        document.addField("id", " ");
        document.addField("name", " ");
        document.addField("descriptions", " ");
        // 获得一个solr服务端的请求，去提交 ,选择具体的某一个solr core
        HttpSolrClient solr = new HttpSolrClient.Builder(SOLR_URL + "new_core").withConnectionTimeout(10000)
                .withSocketTimeout(60000).build();
        solr.add(document);
        solr.commit();
        solr.close();
    }

    // 删除Solr中新建立的索引
    public void deleteDocumentById() throws Exception { // 选择具体的某一个solr core
        HttpSolrClient server = new HttpSolrClient.Builder(SOLR_URL + "new_core").withConnectionTimeout(10000)
                .withSocketTimeout(60000).build();

        server.deleteById("8"); // 删除所有的索引
        // solr.deleteByQuery("*:*");
        // 提交修改
        server.commit();
        server.close();
    }

    // 查询
    public List<String> querySolr(String name) throws Exception {
        HttpSolrClient solrServer = new HttpSolrClient.Builder(SOLR_URL + "pd/").withConnectionTimeout(10000)
                .withSocketTimeout(60000).build();
        SolrQuery query = new SolrQuery();
        List<String> list = new ArrayList<String>();
        // 设置查询条件
        //query.set("q", "*:*");
        // query.set("fl", "title");
        query.set("q", "name:" + name + "OR author:" + name);
        // 获取查询结果
        QueryResponse response = solrServer.query(query);
        SolrDocumentList sds = response.getResults();
        System.out.println(sds.size());
        for (SolrDocument per : sds) {
            String artical_id = (String) per.getFieldValue("name");
            list.add(artical_id);
        }
        return list;
    }
}
