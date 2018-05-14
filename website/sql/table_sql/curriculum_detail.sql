/*
 Navicat MySQL Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : officialwebsite

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 14/05/2018 18:43:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for curriculum_detail
-- ----------------------------
DROP TABLE IF EXISTS `curriculum_detail`;
CREATE TABLE `curriculum_detail`  (
  `detail_id` bigint(18) NOT NULL COMMENT '课程详情ID',
  `detail_curriculum_id` bigint(18) NOT NULL COMMENT '课程ID',
  `curriculum_start_time` datetime(0) NOT NULL COMMENT '课程开始时间',
  `curriculum_end_time` datetime(0) NOT NULL COMMENT '课程结束时间',
  `curriculum_execute_date` datetime(0) NOT NULL COMMENT '上课日期',
  `curriculum_execute_time` datetime(0) NOT NULL COMMENT '上课时间',
  `curriculum_outline` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '课程大纲',
  `curriculum_presentation` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '课程介绍',
  `curriculum_create_time` datetime(0) NOT NULL COMMENT '课程详情创建时间',
  PRIMARY KEY (`detail_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
