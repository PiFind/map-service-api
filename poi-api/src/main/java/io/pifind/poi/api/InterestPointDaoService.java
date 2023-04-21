package io.pifind.poi.api;

import io.pifind.common.response.Page;
import io.pifind.common.response.R;
import io.pifind.poi.model.dto.DaoVoteDTO;
import io.pifind.poi.model.vo.InterestPointVO;

/**
 * 兴趣点 DAO 用户服务
 */
public interface InterestPointDaoService {

    /**
     * 投票
     * @param username 投票者
     * @param voteDTO 投票信息
     * @return 投票结果
     */
    R<Void> vote(String username, DaoVoteDTO voteDTO);

    /**
     * 是否已经投过票
     * @param username 投票者
     * @param interestPointId 兴趣点ID
     * @return 是否已经投过票
     */
    R<Boolean> hasVoted(String username, Long interestPointId);

    /**
     * 获取待审核列表
     * @param username 用户名
     * @param administrativeAreaId 行政区划ID
     * @param currentPage 当前页
     * @param pageSize 每页大小
     * @return 待审核列表
     */
    R<Page<InterestPointVO>> getReviewPage(
            String username,
            Long administrativeAreaId,
            Integer currentPage,
            Integer pageSize
    );

}
