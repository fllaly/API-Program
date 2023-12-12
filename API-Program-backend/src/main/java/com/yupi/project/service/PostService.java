package com.fll.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fll.project.model.entity.Post;

/**
 * 帖子服务
 *
 */
public interface PostService extends IService<Post> {

    /**
     * 校验
     *
     * @param post
     * @param add
     */
    void validPost(Post post, boolean add);

}
