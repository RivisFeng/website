/*
 Navicat MySQL Data Transfer

 Source Server         : sureface
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : officialwebsite

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 20/05/2018 21:58:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for curriculum_video
-- ----------------------------
DROP TABLE IF EXISTS `curriculum_video`;
CREATE TABLE `curriculum_video`  (
  `video_id` bigint(18) NOT NULL COMMENT '视频ID',
  `video_curriculum_id` bigint(18) NOT NULL COMMENT '课程ID',
  `video_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '视频名称（AES加密）',
  `video_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '视频链接（AES加密）',
  `video_sort` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '视频顺序（AES加密）',
  `video_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '视频状态（AES加密）',
  `video_create_time` datetime(0) NOT NULL COMMENT '视频创建时间',
  PRIMARY KEY (`video_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '课程视频' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
