package cn.iocoder.dashboard.modules.system.convert.notice;

import cn.iocoder.dashboard.common.pojo.PageResult;
import cn.iocoder.dashboard.modules.system.controller.notice.vo.SysNoticeCreateReqVO;
import cn.iocoder.dashboard.modules.system.controller.notice.vo.SysNoticeRespVO;
import cn.iocoder.dashboard.modules.system.controller.notice.vo.SysNoticeUpdateReqVO;
import cn.iocoder.dashboard.modules.system.dal.dataobject.notice.SysNoticeDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SysNoticeConvert {

    SysNoticeConvert INSTANCE = Mappers.getMapper(SysNoticeConvert.class);

    PageResult<SysNoticeRespVO> convertPage(PageResult<SysNoticeDO> page);

    SysNoticeRespVO convert(SysNoticeDO bean);

    SysNoticeDO convert(SysNoticeUpdateReqVO bean);

    SysNoticeDO convert(SysNoticeCreateReqVO bean);

}
