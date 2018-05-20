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

 Date: 20/05/2018 21:58:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for enterprise
-- ----------------------------
DROP TABLE IF EXISTS `enterprise`;
CREATE TABLE `enterprise`  (
  `enterprise_id` bigint(18) NOT NULL COMMENT '分公司ID',
  `enterprise_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '分公司名（AES加密）',
  `enterprise_city_id` bigint(18) NOT NULL COMMENT '分公司所在城市ID',
  `enterprise_create_time` datetime(0) NOT NULL COMMENT '分公司创建时间',
  `enterprise_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '分公司状态（AES加密）',
  `enterprise_address` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '分公司地址（AES加密）',
  PRIMARY KEY (`enterprise_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '公司部门' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
