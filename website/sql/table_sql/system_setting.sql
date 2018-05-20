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

 Date: 20/05/2018 21:58:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for system_setting
-- ----------------------------
DROP TABLE IF EXISTS `system_setting`;
CREATE TABLE `system_setting`  (
  `setting_id` bigint(18) NOT NULL COMMENT '系统设置ID',
  `setting_titile` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '系统设置标题（AES加密）',
  `setting_name` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '系统设置组件名字（AES加密）',
  `setting_value` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '系统设置单个值存储位置（AES加密）',
  `setting_values` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '系统设置多个值存储位置（AES加密）',
  `setting_data` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '系统设置数据类型（AES加密）',
  `setting_from` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '系统设置组件类型（AES加密）',
  `setting_sort` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '系统设置排序（AES加密）',
  `setting_description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '系统设置组件描述（AES加密）',
  `setting_create_time` datetime(0) NOT NULL COMMENT '系统设置创建时间',
  PRIMARY KEY (`setting_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '系统前端界面配置' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
