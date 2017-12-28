package com.imooc.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;

/**
 * 用来测试AreaService
 * @author Administrator
 *
 */
public class AreaServiceTest extends BaseTest{
  @Autowired
  private AreaService areaService;
  
  @Test
  public void testGetAreaList(){
	  List<Area> areaList=areaService.getAreaList();
	  System.out.println(areaList.toString());
	  assertEquals("西苑",areaList.get(0).getAreaName());
  }
}
