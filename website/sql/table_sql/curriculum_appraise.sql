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

 Date: 20/05/2018 21:57:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for curriculum_appraise
-- ----------------------------
DROP TABLE IF EXISTS `curriculum_appraise`;
CREATE TABLE `curriculum_appraise`  (
  `appraise_id` bigint(18) NOT NULL COMMENT '评论ID',
  `appraise_user_id` bigint(18) NOT NULL COMMENT '用户ID',
  `appraise_curriculum_id` bigint(18) NOT NULL COMMENT '课程ID',
  `appraise_content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '评论内容（AES加密）',
  `appraise_is_show` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '是否显示 0：不显示 1：显示（AES加密）',
  `appraise_agree_number` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '点赞数（AES加密）',
  `appraise_no_agree_number` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '踩数（AES加密）',
  `appraise_create_time` datetime(0) NOT NULL COMMENT '评论创建时间',
  PRIMARY KEY (`appraise_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '课程评论' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
