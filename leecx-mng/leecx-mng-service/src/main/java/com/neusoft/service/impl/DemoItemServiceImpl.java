package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.service.DemoItemService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.common.pojo.JqGridResult;
import com.neusoft.mapper.DemoItemMapper;
import com.neusoft.pojo.DemoItem;
import com.neusoft.pojo.DemoItemExample;

@Service
public class DemoItemServiceImpl implements DemoItemService {

	@Autowired
	private DemoItemMapper demoItemMapper;
	
	@Autowired
	private Sid sid;
	
	@Override
	public void saveItem(DemoItem item) {
		
		String itemId = sid.nextShort();

		item.setId(itemId);
		item.setAmount(item.getAmount() * 100);
		
		demoItemMapper.insert(item);
	}

	@Override
	public JqGridResult queryItemList(Integer page, Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);
		
		DemoItemExample demoItemExample = new DemoItemExample();
//		Criteria demoItemCriteria = demoItemExample.createCriteria();
		
		List<DemoItem> result = demoItemMapper.selectByExample(demoItemExample);
		
		PageInfo<DemoItem> pageList = new PageInfo<DemoItem>(result);
		
		JqGridResult grid = new JqGridResult();
		grid.setTotal(pageList.getPages());
		grid.setRows(result);
		grid.setPage(pageList.getPageNum());
		grid.setRecords(pageList.getTotal());
		
		return grid;
	}

	@Override
	public DemoItem queryItemById(String itemId) {
		
		DemoItem item = demoItemMapper.selectByPrimaryKey(itemId);
		
		return item;
	}

	@Override
	public void updateItem(DemoItem item) {
		
		demoItemMapper.updateByPrimaryKeySelective(item);
	}

	@Override
	public void deleteItem(String itemId) {
		demoItemMapper.deleteByPrimaryKey(itemId);
	}
	

}
