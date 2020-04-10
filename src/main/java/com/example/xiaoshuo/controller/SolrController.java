package com.example.xiaoshuo.controller;

import com.example.xiaoshuo.utils.SolrUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("solr")
public class SolrController {

    @RequestMapping("/name")
    @ResponseBody
    public String solrSearch(@RequestParam String name) throws Exception {
        SolrUtils solrUtils = new SolrUtils();
        List<String> strings = solrUtils.querySolr(name);
        return strings.toString();
    }
}
