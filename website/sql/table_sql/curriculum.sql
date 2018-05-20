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

 Date: 20/05/2018 21:57:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for curriculum
-- ----------------------------
DROP TABLE IF EXISTS `curriculum`;
CREATE TABLE `curriculum`  (
  `curriculum_id` bigint(18) NOT NULL COMMENT '课程ID',
  `curriculum_subject_id` bigint(18) NOT NULL COMMENT '科目ID',
  `curriculum_teacher_id` bigint(18) NOT NULL COMMENT '课程授课教师ID',
  `curriculum_auxiliary_teacher_id` bigint(18) DEFAULT NULL COMMENT '课程辅助教师ID',
  `curriculum_grade_id` bigint(18) NOT NULL COMMENT '年级ID',
  `curriculum_feature_id` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '课程特色ID',
  `curriculum_outline_id` bigint(18) DEFAULT NULL COMMENT '课程大纲ID',
  `curriculum_presentation_id` bigint(20) DEFAULT NULL COMMENT '课程详情介绍ID',
  `curriculum_enterprise_id` bigint(18) NOT NULL COMMENT '课程所在的公司ID',
  `curriculum_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '课程名字（AES加密）',
  `curriculum_now_cost` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '课程现在的价格（AES加密）',
  `curriculum_old_cost` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '课程以前的价格（AES加密）',
  `curriculum_vip_cost` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '课程VIP的价格（AES加密）',
  `curriculum_create_time` datetime(0) NOT NULL COMMENT '课程创建的时间',
  `curriculum_user_number` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '课程所收的学生的人数（AES加密）',
  `curriculum_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '课程图片（AES加密）',
  `curriculum_type` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '课程类型 0：线下实体课 1：线上直播课 3：线上录播课（AES加密）',
  `curriculum_start_time` datetime(0) DEFAULT NULL COMMENT '课程开始时间',
  `curriculum_end_time` datetime(0) DEFAULT NULL COMMENT '课程结束时间',
  `curriculum_execute_date` date DEFAULT NULL COMMENT '上课日期',
  `curriculum_execute_time` time(0) DEFAULT NULL COMMENT '上课时间',
  `curriculum_difficulty_level` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '课程难度等级 1：一级 2：二级 3：三级 4：四级 5：五级（AES加密）',
  PRIMARY KEY (`curriculum_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '课程' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
