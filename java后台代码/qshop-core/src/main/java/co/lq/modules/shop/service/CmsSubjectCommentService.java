package co.lq.modules.shop.service;

import co.lq.modules.shop.domain.CmsSubjectComment;
import co.lq.modules.shop.service.dto.CmsSubjectCommentDTO;
import co.lq.modules.shop.service.dto.CmsSubjectCommentQueryCriteria;
import org.springframework.data.domain.Pageable;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

/**
* @author billy
* @date 2020-03-27
*/
public interface CmsSubjectCommentService {

    /**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    Map<String,Object> queryAll(CmsSubjectCommentQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<CmsSubjectCommentDTO>
    */
    List<CmsSubjectCommentDTO> queryAll(CmsSubjectCommentQueryCriteria criteria);

    /**
     * 根据ID查询
     * @param id ID
     * @return CmsSubjectCommentDTO
     */
    CmsSubjectCommentDTO findById(Long id);

    /**
    * 创建
    * @param resources /
    * @return CmsSubjectCommentDTO
    */
    CmsSubjectCommentDTO create(CmsSubjectComment resources);

    /**
    * 编辑
    * @param resources /
    */
    void update(CmsSubjectComment resources);

    /**
    * 多选删除
    * @param ids /
    */
    void deleteAll(Long[] ids);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<CmsSubjectCommentDTO> all, HttpServletResponse response) throws IOException;
}