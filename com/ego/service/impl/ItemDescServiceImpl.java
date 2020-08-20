package com.ego.service.impl;

import com.ego.pojo.ItemDesc;
import com.ego.mapper.ItemDescMapper;
import com.ego.service.IItemDescService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品描述表 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-08-20
 */
@Service
public class ItemDescServiceImpl extends ServiceImpl<ItemDescMapper, ItemDesc> implements IItemDescService {

}
