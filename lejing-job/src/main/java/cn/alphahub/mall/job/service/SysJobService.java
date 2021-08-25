package cn.alphahub.mall.job.service;

import cn.alphahub.common.core.page.PageDomain;
import cn.alphahub.common.core.page.PageResult;
import cn.alphahub.mall.job.domain.SysJob;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 定时任务调度表Service接口
 *
 * @author Weasley J
 * @email 1432689025@qq.com
 * @date 2021-08-25 23:15:04
 */
public interface SysJobService extends IService<SysJob> {

    /**
     * 查询定时任务调度表分页列表
     *
     * @param page   分页参数
     * @param sysJob 分页对象
     * @return 定时任务调度表分页数据
     */
    PageResult<SysJob> queryPage(PageDomain page, SysJob sysJob);

}
