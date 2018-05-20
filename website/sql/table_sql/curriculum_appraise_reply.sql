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

 Date: 20/05/2018 21:57:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for curriculum_appraise_reply
-- ----------------------------
DROP TABLE IF EXISTS `curriculum_appraise_reply`;
CREATE TABLE `curriculum_appraise_reply`  (
  `reply_id` bigint(18) NOT NULL COMMENT '回复ID',
  `reply_appraise_id` bigint(18) NOT NULL COMMENT '评论ID',
  `reply_user_id` bigint(18) NOT NULL COMMENT '用户ID',
  `reply_content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '回复内容（AES加密）',
  `reply_is_show` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '是否显示 0：不显示 1：显示（AES加密）',
  `reply_create_time` datetime(0) NOT NULL COMMENT '回复时间',
  PRIMARY KEY (`reply_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '课程评论回复' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
