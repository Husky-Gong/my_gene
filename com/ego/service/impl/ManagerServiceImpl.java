package com.ego.service.impl;

import com.ego.pojo.Manager;
import com.ego.mapper.ManagerMapper;
import com.ego.service.IManagerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台账号 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-08-20
 */
@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerMapper, Manager> implements IManagerService {

}
