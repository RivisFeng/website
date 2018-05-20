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

 Date: 20/05/2018 21:58:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `teacher_id` bigint(18) NOT NULL COMMENT '教师ID',
  `teacher_user_id` bigint(18) NOT NULL COMMENT '用户ID',
  `teacher_school` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '教师毕业学校（AES加密）',
  `teacher_compensation` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '教师工资（AES加密）',
  `teacher_dimission_time` datetime(0) DEFAULT NULL COMMENT '离职时间',
  `teacher_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '教师状态（AES加密）',
  `teacher_motto` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '座右铭',
  `teacher_photo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '教师照片（AES加密）',
  `teacher_create_time` datetime(0) NOT NULL COMMENT '教师创建时间',
  `teacher_look_number` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '查看教师详情的人数（AES加密）',
  `teacher_agree_number` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '对于教师满意的人数（AES加密）',
  PRIMARY KEY (`teacher_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '教师' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
